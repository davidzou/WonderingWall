#!/bin/bash

ls | grep -v create_sample.sh | grep -v clean.sh |  xargs rm -rf
