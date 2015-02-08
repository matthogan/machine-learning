#Machine Learning

##Aim

* Test various ml methods for analysing text based data sources.
* Come up with an ml solution for identifying and merging customers.

##References

https://github.com/google/guice
https://github.com/airbnb/twitter-commons-sample
http://www.gnu.org/software/wget/manual/html_node/HTTP-Options.html
http://nerds.airbnb.com/httpjson-services-in-modern-java/
http://www.gnu.org/software/wget/manual/html_node/HTTP-Options.html
http://www.cs.waikato.ac.nz/ml/weka/requirements.html
http://sourceforge.net/projects/neuroph/

###Commands

Using WGet

Get hello

	wget http://localhost:8080/hello/hello

Post hello

	wget --post-data='{"text":"hi there, lover!"}' \
		--header='Accept: application/json' --header='Content-Type: application/json' \
		http://localhost:8080/hello/hello
