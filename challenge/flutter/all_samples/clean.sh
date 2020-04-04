#!/bin/bash

ls | grep -v create_sample.sh | grep -v clean.sh | grep -v README.md | xargs rm -rf
