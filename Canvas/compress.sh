#!/bin/bash

rm outputsed.txt

cp "$1" "outputsed.txt"

outputfilename="dist/C.java"

gsed -i 's/, /,/g' $outputfilename
gsed -i 's/ = /=/g' $outputfilename
gsed -i 's/ + /+/g' $outputfilename
gsed -i 's/ - /-/g' $outputfilename
gsed -i 's/ \* /\*/g' $outputfilename
gsed -i 's/ \/ /\//g' $outputfilename
gsed -i 's/ {/{/g' $outputfilename
gsed -i 's/ *( */(/g' $outputfilename
gsed -i 's/ *) */)/g' $outputfilename
gsed -i 's/ *< */</g' $outputfilename
gsed -i 's/ *> */>/g' $outputfilename
gsed -i 's/\t//g' $outputfilename
gsed -i -z 's/\n//g' $outputfilename
