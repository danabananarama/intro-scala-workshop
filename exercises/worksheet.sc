import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.Random
import scala.collection.mutable.Map

/*
1. Define a case class "Ticket" with an integer field "id" and string fields "subject", "status", "requester"
*/

case class Ticket()

/*
Now that that's done, feel free to uncomment the code for the mock API Client (try cmd + /). You don't need to worry about this, but might be interesting to read it!
*/
//object APIClient {
//  val tickets: Map[Int, Ticket] = Map(
//    0 -> Ticket(0, "This is an example ticket", "open", "Chuck Norris")
//  )
//
//  def get(id: Int): Ticket = tickets.get(id).get
//
//  def create(subject: String, requester: String): Int = {
//    val ticketId = new Random().nextInt(1000)
//    tickets.update(ticketId, Ticket(ticketId, subject, "open", requester))
//    ticketId
//  }
//
//  def update(id: Int, status: String): Unit = {
//    val ticket = tickets.get(id).get
//    tickets.update(id, ticket.copy(status = status))
//  }
//
//  def asyncGet(id: Int): Future[Ticket] = {
//    Thread.sleep(5000)
//    Future(get(id))
//  }
//
//  def asyncCreate(subject: String, requester: String): Future[Int] = {
//    Thread.sleep(5000)
//    Future(create(subject, requester))
//  }
//}

/*
2. Create a Ticket by directly initialising it as an instance of the case class

3. Create a Ticket using the mock API Client (and fetch it again with APIClient.get)
*/

object Ticket {
  def show(ticket: Ticket): String = {
    /*
    4. Write a function to print out the details of the ticket.

    For bonus points, implement this function as an override on the toString method of the ticket.
    */
    ???
  }

  def showIfOpen(ticket: Ticket): String = {
    /*
    5. Write a function to print out the details of a ticket, but only if the status is "open".
    For a closed ticket, print "This ticket is closed! You don't want to see it."

    6. Next, for a solved ticket, print "This ticket is solved, hooray! <requester> must be happy. You also don't want to see it."

    Did you use pattern matching? If not, try using pattern matching and seeing the difference in how the code looks!
    */
    ???
  }
}

/*
7. Now try and create a ticket using the asyncGet function. You can pass callbacks to the function using _.foreach().
*/
