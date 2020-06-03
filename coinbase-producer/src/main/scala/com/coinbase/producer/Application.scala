package com.coinbase.producer

import com.coinbase.producer.ws.{
  CoinbaseWebsocketClient,
  CoinbaseWebsocketMessageHandler
}

object Application extends App {

  val coinbaseWebsocketClient = new CoinbaseWebsocketClient(
    Configuration.websocketUri
  )

  val messageHandler = new CoinbaseWebsocketMessageHandler()

  coinbaseWebsocketClient.subscribe(Configuration.products, messageHandler)
}
