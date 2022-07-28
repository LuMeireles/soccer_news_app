package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.domain.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();
        List<News> news = new ArrayList<>();
        news.add(new News("Equipe Feminina do Flamengo Jogo às 19h com Equipe Mineira.","Mussum Ipsum, cacilds vidis litro abertis. Per aumento de cachacis, eu reclamis.");
        news.add(new News("Campeonato Feminina Inicia em Agosto","Mussum Ipsum, cacilds vidis litro abertis. Per aumento de cachacis, eu reclamis.");
        news.add(new News("Novas Regras para Remuneração das Equipes Femininas","Mussum Ipsum, cacilds vidis litro abertis. Per aumento de cachacis, eu reclamis.");

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {

        return this.news;
    }
}