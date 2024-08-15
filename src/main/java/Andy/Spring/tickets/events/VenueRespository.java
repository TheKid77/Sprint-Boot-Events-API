package Andy.Spring.tickets.events;

import java.util.List;
import java.util.Optional;

public class VenueRespository {
    private final List<Venue> venues = List.of(
        new Venue(201, "Globomantics Main Office", "Test Street 324", "New York", "USA"),
        new Venue(202, "Sea View Hotel", "Beach Boulevard 823", "Los Angeles", "USA"));

        public Optional<Venue> findById(int id) {
            return venues.stream().filter(venue -> venue.id() == id).findAny();
    }
}        