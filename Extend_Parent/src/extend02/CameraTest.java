package extend02;

public class CameraTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    DSLR dslr = new DSLR();
	    FilmCamera film = new FilmCamera();
	    
	    dslr.takePicture();
	    film.takePicture();
	    
	    dslr.extraPicture();
	    film.smallPicture();

	}
}
