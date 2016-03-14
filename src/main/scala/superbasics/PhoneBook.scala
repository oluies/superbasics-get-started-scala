package superbasics

case class Contact(name: String, phone: String, address: String)

case class PhoneBook(contacts: List[Contact], name: String) {

  /**
    * Exercise 1
    * Return a new PhoneBook including the new contact
    * @param contact
    * @return
    */
  def add(contact: Contact): PhoneBook = ???

  /**
    * Exercise 2
    * Return a list of contacts, sorted by name, a-z
    * @return
    */
  def sortByName: List[Contact] = ???

  /**
    * Exercise 3
    * Return a new PhoneBook excluding the contact(s) matching exactly the
    * name supplied
    * @param name
    * @return
    */
  def delete(name: String): PhoneBook = ???

  /**
    * Exercise 4
    * Implement a function that is able to search for contacts by parts
    * of their names
    * @param name
    * @return List of contacts
    */
  def search(name: String): List[Contact] = ???

  /**
    * Exercise 5
    * Create a new PhoneBook consisting of this and all records of "other"
    * PhoneBook
    * @param other
    * @return
    */
  def concat(other: PhoneBook): PhoneBook = ???

  /**
    * Exercise 6
    * Return the first Contact found,
    * if no one is found, return None
    * @param name
    * @return
    */
  def findByName(name: String): Option[Contact] = ???

  /**
    * Exercise 7
    * Return the first Contact matching the number
    * If no one is found, return None
    * @param number
    * @return
    */
  def findByNumber(number: String): Option[Contact] = ???

  /**
    * Exercise 8
    * Return the number of the first contact whos name is matching supplied
    * string
    * Return "Not found" if not found
    * @param name
    * @return
    */
  def findNr(name: String): String = ???

  /**
    * Exercise 9
    * Return the name of the first contact who's number is matching
    * supplied string
    * Return "No contact" if not found
    * @param number
    * @return
    */
  def findName(number: String): String = ???
  
  
  /**
   * What to do when you're finished?
   * 
   * Why not try out some more stuff?
   * 
   * Add fields to contacts, description, email, etc.
   * 
   * Maybe make it possible to have multiple phone numbers per contact?
   * 
   * You could create a runnable app with a command line interface to make it more useful?
   * 
   * Of course, write unit tests for your new features!
   * 
   */
}
