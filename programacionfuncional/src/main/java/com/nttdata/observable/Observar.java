package com.nttdata.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class Observar {

	public static void main(String[] args) {

		Observable<String> observable = Observable.just("Hola mundo", "Manoli");

		Observer<String> observer1 = new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				// System.out.println("Observer 1 suscrito: " + d);
			}

			@Override
			public void onNext(String t) {
				System.out.println("Observer 1 recibe texto: " + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer 1 recibe error: " + e);
			}

			@Override
			public void onComplete() {
				System.out.println("Observer 1 recibe evento completo");
			}
		};

		Observer<String> observer2 = new Observer<String>() {

			@Override
			public void onSubscribe(Disposable d) {
				// System.out.println("Observer 2 suscrito: " + d);
			}

			@Override
			public void onNext(String t) {
				System.out.println("Observer 2 recibe texto: " + t);
			}

			@Override
			public void onError(Throwable e) {
				System.out.println("Observer 2 recibe error: " + e);
			}

			@Override
			public void onComplete() {
				System.out.println("Observer 2 recibe evento completo");
			}
		};

		observable.subscribe(observer1);
		observable.subscribe(observer2);

	}
}
