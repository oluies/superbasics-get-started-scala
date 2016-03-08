package tutorial

import org.scalatest._

class PhoneBookSpec extends WordSpec with Matchers with PendingIfUnimplemented {
  "tutorial.PhoneBook" should {
    "Exercise 1: add contact" in {
      emptyBook.contacts shouldBe List()
      val dude = Contact("Some dude", "", "")
      val withNisse = emptyBook.add(dude)
      withNisse.contacts shouldBe List(dude)
    }

    "Exercise 2: Sort by name" in {
      fullBook.contacts.head.name shouldBe "Chip Munk"
      val sorted = fullBook.sortByName
      sorted.head.name shouldBe "Anna Conda"
    }

    "Exercise 3: Remove contact" in {
      val noFerris = fullBook.delete("Ferris Wheeler")
      noFerris.contacts shouldNot contain(Contact("Ferris Wheeler", "08123456", "1 Main street"))
    }

    "Exercise 4: Search contacts" in {
      fullBook.search("Armand") shouldBe List(Contact("Harry Armand Bach", "08123456", "1 Main street"))
    }

    "Exercise 4: get multiple contacts in search result" in {
      fullBook.search("Anna") shouldBe List(
        Contact("Anna Conda", "08123456", "1 Main street"),
        Contact("Anna Fender", "08123456", "1 Main street")
      )
    }

    "Exercise 5: concat 2 phonebooks" in {
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
      fullBook.concat(otherBook).contacts shouldBe expected
    }
    "Exercise 6: Return the first matching contact" in {
      fullBook.findByName("Anna Conda") shouldBe Some(Contact("Anna Conda", "08123456", "1 Main street"))
    }
    "Exercise 6: Return None if no match" in {
      fullBook.findByName("Kalle Kula") shouldBe None
    }
    "Exercise 7: Return first matching by number" in {
      fullBook.findByNumber("087342342") shouldBe Some(Contact("Harry Armand Bach", "087342342", "1 Main street"))
    }
    "Exercise 7: Return None if no match" in {
      fullBook.findByNumber("234898791hj2k3") shouldBe None
    }
    "Exercise 8: Find number by name" in {
      otherBook.findNr("Will Power") shouldBe "555-1223"
    }
    "Exercise 8: Return \"Not found\" if not found" in {
      otherBook.findNr("Världens bästa Karlsson") shouldBe "Not found"
    }
    "Exercise 9: Find name by number" in {
      fullBook.findName("087342342") shouldBe "Harry Armand Bach"
    }
    "Exercise 9: Find name by number should return \"No contact\" if not found" in {
      fullBook.findName("051") shouldBe "No contact"
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

trait PendingIfUnimplemented extends SuiteMixin { this: Suite =>

  abstract override def withFixture(test: NoArgTest): Outcome = {
    super.withFixture(test) match {
      case Failed(ex: NotImplementedError) => Pending
      case other => other
    }
  }
}
