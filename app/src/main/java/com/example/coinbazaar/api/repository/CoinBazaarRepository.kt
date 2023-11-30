package com.example.coinbazaar.api.repository

import com.example.coinbazaar.api.CoinBazaarService
import javax.inject.Inject


open class CoinBazaarRepository @Inject constructor(private val coinBazaarApi: CoinBazaarService) :
    CoinBazaarServiceRepository {

    }

interface CoinBazaarServiceRepository {

}