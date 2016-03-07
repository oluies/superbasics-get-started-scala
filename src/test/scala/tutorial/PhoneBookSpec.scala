package tutorial

import org.scalatest.{Matchers, WordSpec}

class PhoneBookSpec extends WordSpec with Matchers {
  "tutorial.PhoneBook" should {
    "add contact" in {
      emptyBook.contacts shouldBe List()
      val dude = Contact("Some dude", "", "")
      val withNisse = emptyBook.add(dude)
      withNisse.contacts shouldBe List(dude)
    }

    "Sort by name" in {
      fullBook.contacts.head.name shouldBe "Chip Munk"
      val sorted = fullBook.byName
      sorted.head.name shouldBe "Anna Conda"
    }

    "Remove contact" in {
      val noNisse = fullBook.remove("Ferris Wheeler")
      noNisse.contacts shouldNot contain(Contact("Ferris Wheeler", "08123456", "1 Main street"))
    }

    "Search contacts" in {
      fullBook.search("Armand") shouldBe List(Contact("Harry Armand Bach", "08123456", "1 Main street"))
    }

    "get multiple contacts in search result" in {
      fullBook.search("Anna") shouldBe List(
        Contact("Anna Conda", "08123456", "1 Main street"),
        Contact("Anna Fender", "08123456", "1 Main street")
      )
    }
  }

  lazy val emptyBook = PhoneBook(List(), "Empty")
  lazy val contacts = List(
    Contact("Chip Munk", "08123456", "1 Main street"),
    Contact("Earl E. Bird", "08123456", "1 Main street"),
    Contact("Ferris Wheeler", "08123456", "1 Main street"),
    Contact("Harry Armand Bach", "08123456", "1 Main street"),
    Contact("Anna Conda", "08123456", "1 Main street"),
    Contact("Anna Fender", "08123456", "1 Main street"),
    Contact("Brad Hammer ", "08123456", "1 Main street")
  )
  lazy val fullBook = PhoneBook(contacts, "Full")
}

