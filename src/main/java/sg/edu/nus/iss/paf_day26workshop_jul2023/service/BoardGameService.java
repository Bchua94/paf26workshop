package sg.edu.nus.iss.paf_day26workshop_jul2023.service;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sg.edu.nus.iss.paf_day26workshop_jul2023.model.Game;
import sg.edu.nus.iss.paf_day26workshop_jul2023.repo.BoardGameRepository;

@Service
public class BoardGameService {

    @Autowired
    private BoardGameRepository repository;

    public List<Game> getAllGames(Integer limit, Integer offset) {
        return repository.getAllGames(limit, offset);
    }

    public List<Game> getAllGamesByRank(Integer limit, Integer offset) {
        return repository.getAllGamesByRank(limit, offset);
    }

    public long getGamesCount() {
        return repository.getGamesCount();
    }

    public Document getGameByID(Integer id) {
        return repository.getGameByID(id);
    }

    public Integer getSumofRatingsByID(Integer id) {
        return repository.getSumofRatingsByID(id);
    }

    public long getCommentsCountByID(Integer id) {
        return repository.getCommentsCountByID(id);
    }

}
