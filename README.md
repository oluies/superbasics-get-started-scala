# The superbasics to get started with Scala
Some basic excercises to get started

# Prerequisites
- Git for getting the tutorial project
- Java JDK 8 to build and run

# Beginners guide to scala
[guide.md](guide.md)

# TLDR;
Install git and java jdk 8, clone this project and continue to [SBT](#sbt)

# Installation

## Git
Linux and Mac should already have git installed
However, on mac you might wanna install a later version from [Homebrew](http://brew.sh/):

```brew install git```

### Windows
Download and install git: https://git-scm.com/download/win

## Java

Install jdk 8 from Oracle:
http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Choose and download the latest jdk for your operating system, ```8u74``` at the time of writing

Run installer

# Clone repo
Open a terminal window and run the following:

```
git clone https://github.com/jesperoman/superbasics-get-started-scala.git
```
cd into the repo:

```
cd superbasics-get-started-scala
```

# SBT
Run sbt:
## Windows command prompt:
```
sbt
```
## OSX, Linux, git-bash on Windows:
```
./sbt
```

Run tests(Inside sbt):
```
test
```

Output should look something like this:
```sbt
[info] Loading global plugins from /Users/jesper/.sbt/0.13/plugins
[info] Loading project definition from /Users/jesper/dev/contacts/project
[info] Set current project to Contacts (in build file:/Users/jesper/dev/contacts/)
> test
[info] Updating {file:/Users/jesper/dev/contacts/}contacts...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 1 Scala source to /Users/jesper/dev/contacts/target/scala-2.11/classes...
[info] Compiling 1 Scala source to /Users/jesper/dev/contacts/target/scala-2.11/test-classes...
[info] PhoneBookSpec:
[info] tutorial.PhoneBook
[info] - should Exercise 1: add contact (pending)
[info] - should Exercise 2: Sort by name (pending)
[info] - should Exercise 3: Remove contact (pending)
[info] - should Exercise 4: Search contacts (pending)
[info] - should Exercise 4: get multiple contacts in search result (pending)
[info] - should Exercise 5: concat 2 phonebooks (pending)
[info] - should Exercise 6: Return the first matching contact (pending)
[info] - should Exercise 6: Return None if no match (pending)
[info] - should Exercise 7: Return first matching by number (pending)
[info] - should Exercise 7: Return None if no match (pending)
[info] - should Exercise 8: Find number by name (pending)
[info] - should Exercise 8: Return "Not found" if not found (pending)
[info] - should Exercise 9: Find name by number (pending)
[info] - should Exercise 9: Find name by number should return "No contact" if not found (pending)
[info] Run completed in 407 milliseconds.
[info] Total number of tests run: 0
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 0, failed 0, canceled 0, ignored 0, pending 14
[info] No tests were executed.
[success] Total time: 12 s, completed 2016-mar-08 14:22:28
>
```

All tests should be marked "pending", your assignment is to make them pass!

Continue to the [exercises](EXERCISES.md)
