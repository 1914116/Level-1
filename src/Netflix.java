
public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Instantiate some Movie objects (at least 5).
		// 2. Use the Movie class to get the ticket price of one of your movies.

		// 3. Instantiate a NetflixQueue.
		// 4. Add your movies to the Netflix queue.
		// 5. Print all the movies in your queue.

		// 6. Use your NetflixQueue object to finish the sentence "the best
		// movie is...."
		// 7. Use your NetflixQueue to finish the sentence "the second best
		// movie is...."
		Movie a = new Movie("Avengers", 5);
		Movie b = new Movie("Nemo", 4);
		Movie c = new Movie("Guardians of the Galaxy", 3);
		Movie d = new Movie("Spiderman", 2);
		Movie e = new Movie("Suicide Squad", 1);
		System.out.println(a.getTicketPrice());
		NetflixQueue x = new NetflixQueue();
		x.addMovie(a);
		x.addMovie(b);
		x.addMovie(c);
		x.addMovie(d);
		x.addMovie(e);
		x.printMovies();
		x.sortMoviesByRating();
		System.out.println("The best movie is " + x.getBestMovie().getTitle());
		System.out.println("The second best movie is " + x.getMovie(1));
	}

}
