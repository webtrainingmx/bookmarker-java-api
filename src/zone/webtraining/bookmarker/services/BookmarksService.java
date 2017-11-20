package zone.webtraining.bookmarker.services;

import zone.webtraining.bookmarker.models.Bookmark;

import java.util.Collection;

public interface BookmarksService {
    Collection<Bookmark> getAll();

    Bookmark get(int id);

    Bookmark create(Bookmark bookmark);

    Bookmark update(Bookmark bookmark);

    Bookmark delete(Bookmark bookmark);
}
