package az.maqa.java.designpatterns.observer.main;

import az.maqa.java.designpatterns.observer.controller.Observer;
import az.maqa.java.designpatterns.observer.model.EmailTopic;
import az.maqa.java.designpatterns.observer.model.EmailTopicSubscriber;

public class Main {

	public static void main(String[] args) {
		Observer observer = new EmailTopicSubscriber("Samir");
		Observer observer2 = new EmailTopicSubscriber("Zakir");

		EmailTopic topic = new EmailTopic();

		// register observer
		topic.register(observer);
		topic.register(observer2);

		// observer subscribe to the topic
		observer.setSubject(topic);
		observer2.setSubject(topic);

		topic.postMessage("Hello guys this is my new video if you like this video please smash the like button.");

	}

}
