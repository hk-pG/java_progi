#!/bin/bash

rm "./dist/C.java"

cp "$1" "dist/C.java"

gsed -i 's/, /,/g' dist/C.java
gsed -i 's/ = /=/g' dist/C.java
gsed -i 's/ + /+/g' dist/C.java
gsed -i 's/ - /-/g' dist/C.java
gsed -i 's/ \* /\*/g' dist/C.java
gsed -i 's/ \/ /\//g' dist/C.java
gsed -i 's/ {/{/g' dist/C.java
gsed -i 's/ *( */(/g' dist/C.java
gsed -i 's/ *) */)/g' dist/C.java
gsed -i 's/ *< */</g' dist/C.java
gsed -i 's/ *> */>/g' dist/C.java
gsed -i 's/\t//g' dist/C.java
gsed -i -z 's/\n//g' dist/C.java
