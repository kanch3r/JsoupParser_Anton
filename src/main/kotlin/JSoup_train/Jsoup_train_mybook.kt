package org.example.JSoup_train
import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect(
        "https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/"
    ).get()
    println(doc.title())

    val quotes: Elements = doc.select("article.sc-14uz67c-0.ccmjFA")


    quotes.forEach { println(it.text()) }


}

