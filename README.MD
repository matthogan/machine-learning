###Commands

Using WGet

Get hello

	wget http://localhost:8080/hello/hello

Post hello

	wget --post-data='{"text":"hi there, lover!"}' \
		--header='Accept: application/json' --header='Content-Type: application/json' \
		http://localhost:8080/hello/hello
