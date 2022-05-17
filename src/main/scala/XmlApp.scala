import scala.xml.{Elem, NodeSeq}

object XmlApp extends App {

  val person: Elem = <person>
  <firstName>John</firstName>
  <lastName>Doe</lastName>
  <emails>
    <email type="primary">john.doe@noone.com</email>
    <email type="secondary">john.doe@noone.com</email>
  </emails>
    <address>
      <street>595 Market Street</street>
      <city>San Francisco</city>
      <zip>94105</zip>
    </address>
  </person>

  val seq: NodeSeq = person \ "firstName"
//  println(seq)

  val seq2: NodeSeq = person \\ "email"
//  println(seq2)
//  seq2.map(email => println(email))

  val seq3: NodeSeq = person \\ "@type"
//  println(seq3)

  val seq4: NodeSeq = person \\ "city"
  println(seq4)

}
