rm tmp -r; mkdir tmp; \
(cd tmp/; \
  unzip -uo ../.gradleBuild/terminal/libs/terminal-2.42.jar; \
  unzip -uo ../.gradleBuild/pty/libs/jediterm-pty-2.42-SNAPSHOT.jar); \
jar -cvf jediterm-pty-2.42.jar -C tmp . ; \
(mv /home/kpe/opt/pycharm/lib/jediterm-pty-2.42.jar /home/kpe/opt/pycharm/lib/jediterm-pty-2.42.jar.bak;
 cp jediterm-pty-2.42.jar /home/kpe/opt/pycharm/lib/jediterm-pty-2.42.jar; )

