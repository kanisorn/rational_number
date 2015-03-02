#!/bin/bash


rev=date + "%T"
version="0.0.1-$rev"

git tag -a "v$version" -m "version $version"
