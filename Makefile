JAVA   := java
JAVAC  := javac
SRC    := Song.java Movie.java Book.java MediaLib.java MediaLibRunner.java
CLASS  := $(patsubst %.java, %.class, $(SRC))
RUNNER := MediaLibRunner.java

all: $(CLASS)

%.class: %.java
	$(JAVAC) $<

.PHONY: run
run: $(CLASS)
	$(JAVA) $(RUNNER)
	
.PHONY: clean
clean:  
	rm -f $(CLASS)
