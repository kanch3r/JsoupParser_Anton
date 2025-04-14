package org.example.JSoup_train
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main() {

    val doc: Document = Jsoup.connect(
        "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    ).get()
    println(doc.title())

    val quotes: org.jsoup.select.Elements = doc.select("div.sc-2aegk7-2.bzpNIu")

    for (quote: Element in quotes) {
        println(quote.text())
        println()
    }

}

