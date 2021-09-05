#!/usr/bin/env bash

# Build docker image using semver from project

image=joakimen/clj-lein-webapp-example
tag=$(bb '(-> "project.clj" slurp read-string (nth 2))' | xargs)
docker build --pull --rm -t "$image":"$tag" .
