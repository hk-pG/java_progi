#!/bin/bash

rm outputsed.txt

cp "$1" "outputsed.txt"

gsed -i 's/, /,/g' outputsed.txt
gsed -i 's/ = /=/g' outputsed.txt
gsed -i 's/ {/{/g' outputsed.txt
gsed -i 's/ *( */(/g' outputsed.txt
gsed -i 's/ *) */)/g' outputsed.txt
gsed -i 's/ *< */</g' outputsed.txt
gsed -i 's/ *> */>/g' outputsed.txt
gsed -i 's/\t//g' outputsed.txt
gsed -i -z 's/\n//g' outputsed.txt
