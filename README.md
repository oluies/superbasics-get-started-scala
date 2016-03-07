# The superbasics to get started with Scala
Some basic excercises to get started

# Prerequisites
- Git for getting the tutorial project
- Java JDK 8 to build and run

# Beginners guide to scala
[guide.md](guide.md)

# TLDR;
Install git and java jdk 8, clone this project and continue to [SBT](#SBT)

# Installation

## Windows

### Git
Download and install git: https://git-scm.com/download/win

### Java

Install jdk 8 from Oracle:
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Choose and download the latest jdk for windows, at the time of writing:
```
jdk-8u74-windows-x64.exe
```
Run installer

Clone repo

```
git clone https://github.com/jesperoman/superbasics-get-started-scala.git
```

Run sbt:
```
sbt
```

Run tests(Inside sbt):
```
test
```


## Mac OSX

### Git
You should already have git installed, but it's recommended to use a newer one than
the default git binary from OSX, install from [Homebrew](http://brew.sh/):
``` brew install git ```

### Java

#### Homebrew
```
brew cask install java
```

#### From Oracle
Install jdk 8 from Oracle:
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Choose and download the latest jdk for OSX, at the time of writing:
```
jdk-8u74-macosx-x64.dmg
```
Run installer

Clone this repo:
```
git clone https://github.com/jesperoman/superbasics-get-started-scala.git
```

Run sbt inside repo:
```
sbt
```

Run tests:
```
test
```


## Linux

### Git
Should already be installed, otherwise something is very wrong

### Java
Install jdk 8 from Oracle:
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Choose and download the latest jdk for Linux, at the time of writing:
```
jdk-8u74-linux-x64.tar.gz
```

(#SBT) 
