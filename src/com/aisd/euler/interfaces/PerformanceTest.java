package com.aisd.euler.interfaces;

import javax.inject.Inject;

public abstract class PerformanceTest {
	protected abstract void init();

	@Inject
	protected IClock clock;
	protected long runtime;

	public final void start() {
		init();
		runtime = clock.time();
		run();
		runtime = clock.time() - runtime;
		onFinished();
	};

	protected abstract void onFinished();

	public abstract void run();
}
