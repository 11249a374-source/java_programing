Thread output order may change each time because the main thread and child thread can run concurrently. Use `start()`, not a direct call to `run()`, to start a new thread.
