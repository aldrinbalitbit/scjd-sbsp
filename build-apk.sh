#!/bin/bash
./gradlew assembleDebug
echo "Build completed! The apks has served."
echo "Files: "
ls app/build/output/apk/debug
