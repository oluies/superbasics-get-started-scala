package tutorial

case class Contact(name: String, phone: String, address: String)

case class PhoneBook(contacts: List[Contact], name: String) {
  def search(name: String): List[Contact] = ???

  def byName: List[Contact] = ???

  def add(contact: Contact): PhoneBook = ???

  def remove(name: String): PhoneBook = ???

}
