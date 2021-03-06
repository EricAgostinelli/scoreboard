package com.carolinarollergirls.scoreboard.jetty;
/**
 * Copyright (C) 2008-2012 Mr Temper <MrTemper@CarolinaRollergirls.com>
 *
 * This file is part of the Carolina Rollergirls (CRG) ScoreBoard.
 * The CRG ScoreBoard is licensed under either the GNU General Public
 * License version 3 (or later), or the Apache License 2.0, at your option.
 * See the file COPYING for details.
 */

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom.Document;
import org.jdom.output.XMLOutputter;
import org.jdom.xpath.XPath;

import com.carolinarollergirls.scoreboard.view.ScoreBoard;
import com.carolinarollergirls.scoreboard.xml.SleepingQueueXmlScoreBoardListener;
import com.carolinarollergirls.scoreboard.xml.XmlDocumentEditor;

public abstract class AbstractXmlServlet extends AbstractRegisterServlet
{
	protected void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
		XmlListener listener = createXmlListener(scoreBoardModel);
		String key = addRegisteredListener(listener);
		response.setContentType("text/xml");
		rawXmlOutputter.output(editor.createDocument("Key", null, key), response.getOutputStream());
		response.setStatus(HttpServletResponse.SC_OK);
	}

	protected XmlListener getXmlListenerForRequest(HttpServletRequest request) {
		return (XmlListener)getRegisteredListenerForRequest(request);
	}

	protected XmlListener createXmlListener(ScoreBoard scoreBoard) {
		return new XmlListener(scoreBoard);
	}

	protected XmlDocumentEditor editor = new XmlDocumentEditor();
	protected XMLOutputter prettyXmlOutputter = XmlDocumentEditor.getPrettyXmlOutputter();
	protected XMLOutputter rawXmlOutputter = XmlDocumentEditor.getRawXmlOutputter();

	protected class XmlListener extends RegisteredListener
	{
		public XmlListener(ScoreBoard sB) {
			queueListener = new SleepingQueueXmlScoreBoardListener(sB.getXmlScoreBoard());
		}

		public Document getDocument(int timeout) { return queueListener.getNextDocument(timeout); }

		public boolean isEmpty() { return queueListener.isEmpty(); }

		public void clearFilter() { queueListener.clearFilter(); }
		public void setFilter(XPath f) { queueListener.setFilter(f); }
		public XPath getFilter() { return queueListener.getFilter(); }

		protected SleepingQueueXmlScoreBoardListener queueListener;
	}
}
