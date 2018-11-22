package br.com.fiap.demopersistencia

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import br.com.fiap.demopersistencia.dao.BancoDeDados
import br.com.fiap.demopersistencia.model.Game

class ListaViewModel(application: Application) : AndroidViewModel(application) {

    private val bd = BancoDeDados.getDatabase(application.applicationContext)
    var games: LiveData<List<Game>>? = null

    fun carrregaGames() {
        games = bd?.gameDAO()?.lerGames()
    }
}