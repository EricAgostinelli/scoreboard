The Carolina Roller Derby Scoreboard is a browser-based scoreboard solution that also provides overlays for video production and the ability to track penalties.

The topics on the [Scoreboard Wiki Main Page](https://github.com/rollerderby/scoreboard/wiki/) are the primary documentation for the scoreboard. In addition to the wiki topics, the [Derby Scoreboard Facebook group](https://www.facebook.com/groups/derbyscoreboard/) is very active and currently the best way to reach other users and developers.

A mailing list and wiki were available on SourceForge (the original location for this project) but they are not currently used. Subscribing to the SourceForge mailing list and consulting the wiki there is not recommended.

# Installing the Scoreboard Software

These are instructions for getting the software installed and running on a standalone computer to provide a functioning scoreboard. If you have already done this, see **Quick Start Guide to Operating the Scoreboard** below.

## Hardware Requirements

Most Apple or Windows computers that have been manufactured in the last ten years should be able to handle the scoreboard well on a standalone setup. In general, a machine with at least a dual-core 64-bit processor and 2 gigabytes of RAM should be sufficient. Using the scoreboard to provide video overlays or in a networked setup that includes a scoreboard assistant or penalty tracker typically requires more computing power.

Chromebooks that have been modified to run Linux distributions have been used to host the scoreboard but hardware limitations (lack of a suitable display output or low-powered CPUs) may cause issues.

There are experimental versions of the scoreboard available that will run on Android devices. Contact the developers for more information.

## Software Requirements

The scoreboard should be unzipped into a folder on the local machine. The user running the software requires write access to this folder. Do not put the scoreboard in a folder that requires administrator privileges to write to unless you intend to run the software as an administrator.

### Web Browser

[Google Chrome](https://www.google.com/chrome/) or its open source parent [Chromium](http://www.chromium.org/) are recommended for running the software. Some known issues may occur when using Mozilla Firefox or Apple Safari. Microsoft Edge and Microsoft Internet Explorer are not recommended.

### Java

Java is required for providing a Java Runtime Environment (JRE) version 1.7.0 or newer. Installing the latest version of Oracle's Java is recommended.

* Windows users can install the standard Java for Windows package that is available when clicking on Free Java Download from [Oracle’s Java site](https://java.com/).

* Apple users must install the complete [Java Platform (JDK)](http://www.oracle.com/technetwork/java/javase/downloads/index.html), which includes the JRE, to run the scoreboard properly.

* Linux users may already have a JRE from the OpenJDK project installed, if not, OpenJDK can be obtained from [their repositories](http://openjdk.java.net/install/).

## Downloading the Scoreboard

The project is currently hosted on GitHub, and ZIP files can be downloaded from the [GitHub Releases Page](https://github.com/rollerderby/scoreboard/releases). It is recommended that you use the version labeled "Latest release" (green box). The "Pre-release" (orange box) versions are currently in development and testing, and are not recommended for sanctioned games or tournaments.

Please note that an older version of the project is still hosted on SourceForge and it is no longer maintained there.

## Setting up the Scoreboard

Once Chrome and Java are installed, use your file manager to navigate to the scoreboard folder and run the scoreboard background script by double-clicking on it.

* Windows users: Run scoreboard-Windows.exe to start the script.

* Apple users: Run scoreboard-Mac.app to start the script. If you are unable to start it, you may have to download and run the [startscoreboard-mac.zip package](https://drive.google.com/file/d/0B2fZmT3bqA9oS25KNHphZjFFcWs/view?fref=gc&dti=480408282040949) to get the scoreboard started.

* Linux users: Run scoreboard-Linux.sh to start the script. If you are unable to start it, you may have to allow script files to be executable as programs.

Once it starts successfully, the scoreboard script will open a new window and display a series of status messages. You must keep this script running in order for the scoreboard to function, so do not close the window. You may minimize the window without effect.

In your file manager, open start.html with the recommended browser. You may need to right-click on the file and choose the **Open With** option. The browser will open to localhost:8000 where several options are presented.

Assuming that your scoreboard computer is set up with a monitor/laptop screen as a primary display for the operator, and a separate projector as a second display, right-click on the second link for **Main Scoreboard** and choose **Open link in new window**. Drag the new window with the main scoreboard onto the second display, click inside the window, and press the F11 key to make the window full screen. In the first browser window that you opened on the primary display, click on **Main Operator Control Panel**.

When the control panel displays, it will ask you for an operator name. Enter your name and click Login. This operator name is used to store your personalized settings such as key controls.

# Quick Start Guide to Operating the Scoreboard

These instructions are intended to get you up and running as fast as possible with operating a scoreboard computer that is in the following state:

* The Carolina Roller Derby Scoreboard software is installed.
* The scoreboard script is running.
* The start page is open.
* The computer is connected to a second display.
* The Main Scoreboard page is on the second display, and the Main Operator Control Panel is on the primary display.
* The operator is logged in to the control panel.

For instructions on how to accomplish this, see **Installing the Scoreboard Software** above.

## Initial Setup

After logging in, you will be viewing the **Team/Time** tab. The first thing to do is reset the scoreboard controls in case information from an old game is still present. Click on the **Save/Load** tab, then click on the **Reset scoreboard only** button. Confirm by clicking **Yes, reset the scoreboard**. Click on the **Team/Time** tab to return to the main control panel.

Next, if you need to get the scoreboard started quickly, and you do not have teams defined in the **Teams** tab, define the team names on the control panel. Click on the name of the team in the upper left, which should be _Team 1_. The **Team Name** and **Alternate Name** fields will appear. Highlight the text in the **Team Name** field that says _Team 1_, type in the name for the team, and press Enter on the keyboard. Repeat these steps for _Team 2_ on the upper right.

Finally, make sure the undo controls are visible. If you do not see buttons for **UN-Start Jam**, **UN-Stop Jam**, and **UN-Timeout**, click the **Show UNDO controls** button at the top of the page.

## Starting the Game

If you need to get the scoreboard started quickly, and you do not need other functions such as the scoreboard assistant or penalty tracking, simply click the Start Jam button when the first whistle blows. This will start the jam and period clocks.

If there is some time before the game starts, and you have teams defined in the **Teams** tab, click the **Start New Game** button. Select both teams and enter the start time in AM/PM format. Click **Start Game**. The Time To Derby clock will display on the scoreboard and begin counting down. Note that using the Start Game button is the only way to enable other functionality such the scoreboard assistant and penalty tracking.

## During the Game

The scoreboard operator has two essential jobs during the game: controlling the clock and updating the score.

### Controlling the Clock

Controlling the clock should always be done using the **Start Jam**, **Stop Jam**, and **Timeout** buttons at the top of the page. _Do not_ use the **Start** and **Stop** buttons under the individual clocks at the bottom of the page.

* **Start Jam**: Click this button when the jam timer blows the whistle to start the jam, which should always come after a "five seconds" warning.
* **Stop Jam/TO**: Click this button during the burst of four whistles that ends the jam, either by the lead jam referee, or (rarely) another referee that ends the jam. In a two minute jam, you can let the Jam clock run out by itself and the scoreboard will automatically go back to the Lineup clock. If you also press the **Stop Jam/TO** button at the same time or shortly after, it will simply be ignored.
* **Timeout**: Click this button if a referee or the jam timer blows a burst of four whistles for a timeout. Once the timeout clock is started, determine what type of timeout it is.
  * If it is an official timeout, do nothing.
  * If it is a team timeout, click the **Timeout** button under the appropriate team.
  * If it is an official review, click the **Off Review** button under the appropriate team. Once the official review is over, if the team has retained their review, click the **Retained** button for that team.
  * For all types of timeouts, you can start a lineup clock when a rolling whistle is blown by the jam timer or referees by clicking the **Stop Jam/TO** button. No matter if you do this or not, click the **Start Jam** button when the jam timer blows the whistle for the next jam.

### Updating the Score

To raise or lower the score for a team, click the **Score +1** or **Score -1** button under the appropriate team. It is not recommended to use the **Jam Score** buttons.

### Correcting Scores, Timeouts, and Clocks

If you need to adjust a number for Team 1 or Team 2, such as the total score or timeouts remaining, just click on the number, select the number, type in the new value, and press Enter on the keyboard.

If you need to adjust the value of a clock, use the +1 and -1 buttons on either side of the clock. _Do not_ adjust the value of the period clock except when it is stopped during timeouts.

That's all you need for a basic game. For more detailed information about scoreboard procedures, browse the topics on the [Scoreboard Wiki Main Page](https://github.com/rollerderby/scoreboard/wiki/).
