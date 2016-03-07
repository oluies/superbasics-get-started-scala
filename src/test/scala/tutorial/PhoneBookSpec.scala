package tutorial

import org.scalatest.{Matchers, WordSpec}

class PhoneBookSpec extends WordSpec with Matchers {
  "tutorial.PhoneBook" should {
    "Excercise 1: add contact" in {
      emptyBook.contacts shouldBe List()
      val dude = Contact("Some dude", "", "")
      val withNisse = emptyBook + dude
      withNisse.contacts shouldBe List(dude)
    }

    "Excercise 2: Sort by name" in {
      fullBook.contacts.head.name shouldBe "Chip Munk"
      val sorted = fullBook.sortByName
      sorted.head.name shouldBe "Anna Conda"
    }

    "Excercise 3: Remove contact" in {
      val noNisse = fullBook - "Ferris Wheeler"
      noNisse.contacts shouldNot contain(Contact("Ferris Wheeler", "08123456", "1 Main street"))
    }

    "Excercise 4: Search contacts" in {
      fullBook.search("Armand") shouldBe List(Contact("Harry Armand Bach", "08123456", "1 Main street"))
    }

    "Excercise 4: get multiple contacts in search result" in {
      fullBook.search("Anna") shouldBe List(
        Contact("Anna Conda", "08123456", "1 Main street"),
        Contact("Anna Fender", "08123456", "1 Main street")
      )
    }

    "Excercise 5: concat 2 phonebooks" in {
      val expected = List(
        Contact("Chip Munk", "08123456", "1 Main street"),
        Contact("Earl E. Bird", "08123456", "1 Main street"),
        Contact("Ferris Wheeler", "08123456", "1 Main street"),
        Contact("Harry Armand Bach", "087342342", "1 Main street"),
        Contact("Anna Conda", "08123456", "1 Main street"),
        Contact("Anna Fender", "08123456", "1 Main street"),
        Contact("Brad Hammer ", "08123456", "1 Main street"),
        Contact("Morey Bund", "555-1223", "45 Hudson"),
        Contact("Ray Gunn", "555-1223", "45 Hudson"),
        Contact("Russell Sprout", "555-1223", "45 Hudson"),
        Contact("Will Power", "555-1223", "45 Hudson"),
        Contact("Iona Ford", "555-1223", "45 Hudson")
      )
      (fullBook ++ otherBook).contacts shouldBe expected
    }
    "Excercise 6: Return the first matching contact" in {
      fullBook.findByName("Anna Conda") shouldBe Contact("Anna Conda", "08123456", "1 Main street")
    }
    "Excercise 7: Return first matching by number" in {
      fullBook.findByNumber("087342342") shouldBe Contact("Harry Armand Bach", "087342342", "1 Main street")
    }
    "Excercise 8: " in {
      otherBook.findNr("Will Power") shouldBe "555-1223"
    }
    "Excercise 9: " in {
      fullBook.findName("087342342") shouldBe "Harry Armand Bach"
    }
  }

  lazy val emptyBook = PhoneBook(List(), "Empty")
  lazy val contacts = List(
    Contact("Chip Munk", "08123456", "1 Main street"),
    Contact("Earl E. Bird", "08123456", "1 Main street"),
    Contact("Ferris Wheeler", "08123456", "1 Main street"),
    Contact("Harry Armand Bach", "087342342", "1 Main street"),
    Contact("Anna Conda", "08123456", "1 Main street"),
    Contact("Anna Fender", "08123456", "1 Main street"),
    Contact("Brad Hammer ", "08123456", "1 Main street")
  )
  lazy val fullBook = PhoneBook(contacts, "Full")
  lazy val other = List(
    Contact("Morey Bund", "555-1223", "45 Hudson"),
    Contact("Ray Gunn", "555-1223", "45 Hudson"),
    Contact("Russell Sprout", "555-1223", "45 Hudson"),
    Contact("Will Power", "555-1223", "45 Hudson"),
    Contact("Iona Ford", "555-1223", "45 Hudson")
  )
  lazy val otherBook = PhoneBook(other, "Other")
}

