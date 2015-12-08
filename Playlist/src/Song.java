
public class Song {
	private String m_name;
	private String m_ranking;
	private String m_artist;
	private double Ranking;
	
	Song(String name, String ranking, String artist){
		setM_name(name);
		setM_ranking(ranking);
		setM_artist(artist);
	}
	private void setM_name(String name) {
		// TODO Auto-generated method stub
		
	}
	public int getName(){
		int Name = 0;
		return Name;
	}
	public void setName(String Name){
		this.setM_name(Name);
	}
	public int setRanking(double Ranking){
		return (int) Ranking;
	}
	public int getRanking(double Ranking){
		this.Ranking = Ranking;
		return (int) Ranking;

	}
	public String setM_ranking() {
		return m_ranking;
	}
	public void setM_ranking(String m_ranking) {
		this.m_ranking = m_ranking;
	
	}
	public String getM_artist() {
		return m_artist;
	}
	public void setM_artist(String m_artist) {
		this.m_artist = m_artist;
	}
}
	
	

	

