# Kitty Fung, Priscilla Lee
## __Country Runner__
---------------------
Country runner is 2-dimensional side-scrolling game. The objective of the game is to avoid obstacles and accumulate points to beat your opponents.

## __User Stories__
-------------------
* As a user, I can open the score board so that I can check my rank among other players.
* As a user, I can view instructions so that I can learn to navigate and complete the game.
* As a user, I can choose a difficulty level so that I can change the pace of the game.
* As a user, I can choose an avatar so that I can pick which model appeals to me.
* As a user, I can choose a background so that I can so that I can pick which scenery appeals to me.
* As a user, I can jump so that I can avoid obstacles.
* As a user, I can shoot missiles so that I can destroy obstacles.

## __Software__
-------------------
The software runs with strong delay and multiple bugs. The player is able to jump and shoot missiles to avoid obstacles and accumulate points. The player can also change the difficulty level, avatar, and background.

## __User Stories__ 
-------------------
* As a user, I can change the background in the game to reflect seasons or time of day so that there is a change in scenery.
* As a user, I can create new worlds after accumulating a certain amount of points so that there is a change in obstacles and scenery.
* As a user, I can see how often missiles are created and how many missiles are left so I can score more points and level up.
* As a user, I can go to a special game shop with my points converted into game currency to purchase objects such as life potions to give myself more chances in the game and turtle suits to slow down the game or special avatars so I can score more points, level up, and also enhance my overall experience of the game.

## __README__
-------------
We think the current README.md. is helpful, since it describes the objective of the game thoroughly and hints how we can improve it. However, it could also include what each .java file functions as so the programmers can get a better sense of the code. It would also be easier if the previous programmers stated any problems they came across and how it affected their work.

## __Build__
------------
The current build.xml file is made using Ant. It is written and formatted really well, with comments that describe the targets per section. However, there is a small bug in the build.xml where we should separate the main package name and main class name variables so it is easier to update the build.xml file when the project changes.

## __Current Issues__
---------------------
There are a lot of issues, such as a glitchy level system, glitchy ghost sprites, fixing file indentations, and allow different jumping heights. The issues are clear in terms of what the expectations are. There are enough issues that we can earn 1000 points by working on this project, but they are very limited. It would be great if we could also add in features that we want to create on our own to also earn points.

## __Aditional Issues__
-----------------------
Current “issues” include:
* Newer versions of Java do not support sun.audio.AudioPlayer or sun.audio.AudioStream/any(.sun imports do not work), so we have to comment out parts of the code that relate to music and audio in order to run the [program.](https://github.com/ucsb-cs56-projects/cs56-games-country-runner/issues/92)
* We would like to make a change in background scenery based on the time of the day that the user plays the [game.](https://github.com/ucsb-cs56-projects/cs56-games-country-runner/issues/93)
* We would like to have a missiles check feature so the player knows how long until the new missile [appears.](https://github.com/ucsb-cs56-projects/cs56-games-country-runner/issues/94)
* We want to create an inventory that lets the player store items that were not [used.](https://github.com/ucsb-cs56-projects/cs56-games-country-runner/issues/95)
* We want to convert points into game currency so the user can buy power-up items in a [store.](https://github.com/ucsb-cs56-projects/cs56-games-country-runner/issues/96)
* We want to create a game shop that users go to purchase power up [items.](https://github.com/ucsb-cs56-projects/cs56-games-country-runner/issues/97)

## __Source Code__
------------------ 
The code is organized in two important components, classes that hold different objects that are essential in the game such as the sprites, backgrounds, obstacles, and classes that focus on the actual controlling/playing part such as CountryRunnerJPanel and Score. The code is separated really well so there are less dependencies. The purpose of the classes and methods are clear. It is also obvious how the classes relate to one another, and the code is easy to read and understand. For example, Raccoon.java extends Obstacle, where the code holds information about Raccoons appearing in the game and incrementScore() which increases the player’s score by 1 if the player attacks the Raccoon. Obstacle.java extends Sprite and holds more generic methods that each subclass such as Raccoon and Sheep can use, such as updatdeCurrentImage() and incrementScore(). Runner.java extends Sprite which holds the position of the Runner moving, dying, jumping, fire() which lets the player shoot missiles, and startJump() which lets the player use its character to jump in the game. Sprite.java extends GeneralPathWrapper and is an abstract class that includes features that all general sprites have. GameOverJPanel.java holds code that saves the score, restarts the game and goes back to the main menu. If I had to give someone else a one screenful text, I would say “This project is like a mini Mario game, where the player goes through obstacles to gain points and level up. The project is organized in an object oriented style, separated by sprites as a superclass, avatar and obstacles as subclasses. The main .java file is CountryRunnerJPanel, where you can improve the controls, movements, and the overall flow of the game.”

## __Tests__
------------
Since there is no test.java class, the test coverage is not ideal. There are no JUnit tests that I can find, so the project covers “testing” by running the game each time and manually playing it to see if there are any bugs. There are opportunities to expand test coverage, such as writing a test.java class to test the game and methods separately, including JUnit tests.
