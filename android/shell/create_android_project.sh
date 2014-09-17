#!/bin/bash
############################################################################################
##    Creates a new Android project.
##    Usage:
##        android [global options] create project [action options]
##    Global options:
##        -h --help       : Help on a specific command.
##        -v --verbose    : Verbose mode, shows errors, warnings and all messages.
##           --clear-cache: Clear the SDK Manager repository manifest cache.
##        -s --silent     : Silent mode, shows errors only.
##        
##    Action "create project":
##    Options:
##        -n --name          : Project name.
##        -v --gradle-version: Gradle Android plugin version.
##        -t --target        : Target ID of the new project. [required]
##        -p --path          : The new project's directory. [required]
##        -g --gradle        : Use gradle template.
##        -k --package       : Android package name for the application. [required]
##        -a --activity      : Name of the default Activity that is created. [required]
############################################################################################
echo "Please type project name:"
read PROJECT_NAME
if [ -z $PROJECT_NAME ]; then
	echo "project name is null"
	exit 0
else
	echo "project name is $PROJECT_NAME"
fi

case "$1" in
	lib)
		android create lib-project -n $PROJECT_NAME -t android-19 -p ../$PROJECT_NAME -k com.wonderingwall.$PROJECT_NAME
	;;
	*)
		android create project -n $PROJECT_NAME -t android-19 -p ../$PROJECT_NAME -k com.wonderingwall.$PROJECT_NAME -a MainActivity
	;;
esac

