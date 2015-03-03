package adapt.dto;

public class Episode {

	private int id;
	private Series series;
	private Integer episodeNumber;
	private Integer timing;
	private String channel;
	private Long requestDate;
	private Long demandDate;
	private Long airDate;
	private Long confirmDate;
	private Employee confirmedBy;
	private String ardomeName;
	private String notes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public Integer getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(Integer episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public Integer getTiming() {
		return timing;
	}

	public void setTiming(Integer timing) {
		this.timing = timing;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Long getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Long requestDate) {
		this.requestDate = requestDate;
	}

	public Long getDemandDate() {
		return demandDate;
	}

	public void setDemandDate(Long demandDate) {
		this.demandDate = demandDate;
	}

	public Long getAirDate() {
		return airDate;
	}

	public void setAirDate(Long airDate) {
		this.airDate = airDate;
	}

	public Long getConfirmDate() {
		return confirmDate;
	}

	public void setConfirmDate(Long confirmDate) {
		this.confirmDate = confirmDate;
	}

	public Employee getConfirmedBy() {
		return confirmedBy;
	}

	public void setConfirmedBy(Employee confirmedBy) {
		this.confirmedBy = confirmedBy;
	}

	public String getArdomeName() {
		return ardomeName;
	}

	public void setArdomeName(String ardomeName) {
		this.ardomeName = ardomeName;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

}
