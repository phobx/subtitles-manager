package adapt.dao;

import java.util.List;

import adapt.dto.Episode;
import adapt.dto.Series;

public interface EpisodeDao {

	List<Episode> getEpisodesBySeries(Series series);

	List<Episode> getEpisodesByAirDate(Long airdate);

	List<Episode> searchEpisode(String query);

}
