package S05T02N01.DiceGame.model.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import S05T02N01.DiceGame.model.domain.Game;
import S05T02N01.DiceGame.model.domain.Player;
import S05T02N01.DiceGame.model.domain.Roll;
import S05T02N01.DiceGame.model.dto.RollDTO;

@Repository
public interface RollRepository extends JpaRepository<Roll, Integer> {
	public List<Roll> findAllByGameGameId(int gameId);
	public void deleteAllByGameGameId(int gameId);
}