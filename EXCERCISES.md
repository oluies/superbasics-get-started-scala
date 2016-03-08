# Excercises

Your task is to make the [PhoneBook.scala](src/main/scala/tutorial/PhoneBook.scala) complete
Start sbt with the command ~test:

```sbt ~test```

All excercises

### Excercise 1
#### Add contact
```def +(contact: Contact): PhoneBook = ???```

Modify the function so that it return a new ```PhoneBook``` with the supplied ```Contact``` prepended or appended to the contacts list.

### Excercise 2
Function`
Return a list of contacts, sorted by name, a-z

### Excercise 3
Return a new PhoneBook excluding the contact(s) matching exactly the
name supplied

### Excercise 4
Implement a function that is able to search for contacts by parts
of their names

### Excercise 5
Create a new PhoneBook consisting of this and all records of "other"
PhoneBook

### Excercise 6
Return the first Contact found,
if no one is found, return None

### Excercise 7
Return the first Contact matching the number
If no one is found, return None

### Excercise 8
Return the number of the first contact whos name is matching supplied
string
Return "Not found" if not found

### Excercise 9
Return the name of the first contact who's number is matching
supplied string
Return "No contact" if not found
