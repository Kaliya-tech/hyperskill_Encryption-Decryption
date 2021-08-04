class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, Integer size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        int titleLenght1 = this.title.length();
        int titleLenght2 = otherArticle.getTitle().length();
        int result;

        this.title.compareTo(otherArticle.getTitle())

        if (this.size == otherArticle.getSize()) {
            if (titleLenght1 < titleLenght2) {
                result = 1;
            } else if (titleLenght1 > titleLenght2) {
                result = -1;
            } else {
                result = 0;
            }

        } else {
            if (this.size > otherArticle.getSize()) {
                result = 1;
            } else {
                result = -1;
            }
        }
        return result;
    }
}