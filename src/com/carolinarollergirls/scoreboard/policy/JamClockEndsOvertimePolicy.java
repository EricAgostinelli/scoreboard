package com.carolinarollergirls.scoreboard.policy;
/**
 * Copyright (C) 2008-2012 Mr Temper <MrTemper@CarolinaRollergirls.com>
 *
 * This file is part of the Carolina Rollergirls (CRG) ScoreBoard.
 * The CRG ScoreBoard is licensed under either the GNU General Public
 * License version 3 (or later), or the Apache License 2.0, at your option.
 * See the file COPYING for details.
 */

import java.util.*;

import com.carolinarollergirls.scoreboard.*;
import com.carolinarollergirls.scoreboard.model.*;
import com.carolinarollergirls.scoreboard.defaults.*;

public class JamClockEndsOvertimePolicy extends AbstractClockRunningChangePolicy
{
  public JamClockEndsOvertimePolicy() { super(ID, DESCRIPTION); }

  public void setScoreBoardModel(ScoreBoardModel sbm) {
    super.setScoreBoardModel(sbm);
    addClock(Clock.ID_JAM);
  }

  protected void clockRunningChange(Clock clock, boolean running) {
    if (!running && getScoreBoardModel().isInOvertime())
      getScoreBoardModel().setInOvertime(false);
  }

  public static final String ID = "Jam Clock Ends Overtime";
  public static final String DESCRIPTION = "This ends Overtime (if the bout is in Overtime).  When the Jam clock stops, Overtime is set to false.";
}
