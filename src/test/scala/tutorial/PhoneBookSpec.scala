package tutorial

import org.scalatest.{Matchers, WordSpec}

class PhoneBookSpec extends WordSpec with Matchers {
  "tutorial.PhoneBook" should {
    "add contact" in {
      val pb = PhoneBook()
      pb.contacts shouldBe List()
      val nisse = Contact("Nisse")
      val withNisse = pb.add(nisse)
      withNisse.contacts shouldBe List(nisse)
    }

    "Sort by name" in {
      val pb = PhoneBook()
        .add(Contact("Adam", "08123457", "Storgatan 2"))
        .add(Contact("Bertil", "08123456", "Storgatan 1"))

      pb.contacts.head.name shouldBe "Bertil"
      val sorted = pb.byName
      sorted.head.name shouldBe "Adam"
    }

    "Remove contact" in {
      val pb = PhoneBook(List(Contact("nisse"), Contact("kalle")))
      pb shouldBe PhoneBook(List(Contact("nisse"), Contact("kalle")))
      val noNisse = pb.remove("nisse")
      noNisse.contacts shouldBe List(Contact("kalle"))
    }

    "Search contacts" in {
      val pb = PhoneBook(List(
        Contact("Kalle"),
        Contact("Nisse Nilsson"),
        Contact("Bosse")
      ))
      pb.search("Nisse") shouldBe List(Contact("Nisse Nilsson"))
    }

    "get multiple contacts in search result" in {
      val pb = PhoneBook(List(
        Contact("Nils Bengtsson"),
        Contact("Kalle Karlsson"),
        Contact("Johan Nilsson"),
        Contact("Nils Johansson")
      ))
      pb.search("Nils") shouldBe List(
        Contact("Nils Bengtsson"),
        Contact("Johan Nilsson"),
        Contact("Nils Johansson")
      )
    }
  }
}
