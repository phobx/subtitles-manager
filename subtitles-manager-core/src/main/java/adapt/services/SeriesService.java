package adapt.services;

import java.util.List;

import adapt.dto.Series;

public interface SeriesService {

	List<Series> getAllSeries();

	Series getSeriesById(int id);

	List<Series> searchSeries(String search);

}
