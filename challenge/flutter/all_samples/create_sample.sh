#!/bin/bash


########################
# 检验系统环境是否包含了该条命令
#   $1 命令
#   $2 提示消息(自定义，当失败时) (OPTION)
#   $return  RESULT(命令所在路径)
########################
function has_command() {
    if [[ -z ${1} ]] ; then
        echo "================================"
        echo "No argument in command has."
        echo "================================"
        echo ""
        exit 1
    fi
    RESULT=`which $1`
    if [[ -z ${RESULT} ]] ; then
        if [[ -z ${2} ]] ; then
            echo "=========================================="
            echo "Not find command '$1'. Please install it."
            echo "=========================================="
            echo ""
        else
            echo "================================"
            echo -e $2
            echo "================================"
            echo ""
        fi
        exit 1
    fi
    return 0
}

# If Flutter not installed.
has_command flutter "Not found command 'flutter'.
\\n\\nTo install it and see
https://flutter.dev/docs/get-started/install
or 'https://flutterchina.club/get-started/install/' in China."

# If Jq not installed.
has_command jq "Not found command 'jq'.
\\n\\nTo install it and see https://stedolan.github.io/jq/download/."

# Get all Sample list.
flutter create --list-samples=samples_all.json

ALL=`jq -rS '.[].id' samples_all.json | sed "s/\./_/g"`

for SAMPLE_VALUE in `jq -rS '.[].id' samples_all.json` ;
do
    # The flutter project name must be to lowercase.
    SAMPLE_NAME=`echo ${SAMPLE_VALUE//./_} | tr A-Z a-z`

    echo "flutter create --sample=$SAMPLE_VALUE --no-pub --offline ${SAMPLE_NAME}"
    # Flutter create project command.
    flutter create --sample=$SAMPLE_VALUE --no-pub --offline ${SAMPLE_NAME}

    echo "create it -- ${SAMPLE_NAME}."
    echo ""
done
