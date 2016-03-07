package tutorial

case class Contact(name: String, phone: String = "", address: String = "")

case class PhoneBook(val contacts: List[Contact] = List(), val name: String = "New phone book") {
  def search(name: String): List[Contact] = ???

  def byName: List[Contact] = ???

  def add(contact: Contact): PhoneBook = ???

  def remove(name: String): PhoneBook = ???
}
