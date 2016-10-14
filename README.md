# ScoutingApp
## Description
A small app written in Java to help us gather and organize scouting data better.

## Goals
* Run a local program on a laptop to gather data
* Export the data as a JSON and send it to a computer acting as a server
* Parse that data and import it into Tableau or some other similar software.

## How To Use:
####Note that this is stil WIP and these instructions may not apply
* Create a file called template.json with the values that you want to be able to choose
* make sure this template.json is in the same folder as the jar or app that is being executed.
* host the <a href="link">server</a> with the same port (found in the Options class)
* link the server to the graphing utility or whatever other program you want to use

## TODO:
* ~~Be able to export to JSON~~
* ~~Get the teams number~~
* Get other information about the team
* Get the teams performance
* Make it easier to change what the program asks
* Send the JSON to another program 
* Have another program to parse the JSON
* Export parsed data to tableau

## Compiling from source:
* run the "jar" build
* go into lib and run the app.sh with `./app.sh` (note that you may need to run `chmod a+x app.sh` to execute it)
