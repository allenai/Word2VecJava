# Word2vecJava

[![CircleCI](https://circleci.com/gh/allenai/Word2VecJava.svg?style=svg)](https://circleci.com/gh/allenai/Word2VecJava)

This is a fork of the open source Java implementation of word2vec (https://github.com/medallia/Word2VecJava) ported to work with SBT, and has some fixes to support large models. 

It gets published to Maven Central under package name `org.allenai.word2vec.Word2VecJava`. All package referenences are changed from `com.medallia.word2vec` to `org.allenai.word2vec` in the Java source code.

## Building the project and Running tests
To verify that the project is building correctly, run 
```
sbt clean compile
sbt test
```

It should run 7 tests without any error.

## Contact
Sumithra Bhakthavatsalam (sumithrab@allenai.org)
