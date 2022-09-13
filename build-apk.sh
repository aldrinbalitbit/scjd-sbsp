#!/bin/bash
./gradlew assembleDebug
echo "Build completed! The apks has served."
echo "Those are served apk files are:"
ls app/build/apk
