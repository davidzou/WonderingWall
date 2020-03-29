FROM ubuntu
RUN rm /etc/dpkg/dpkg.cfg.d/excludes
RUN apt-get update 
RUN dpkg -l | grep ^ii | cut -d' ' -f3 | xargs apt-get install -y --reinstall
RUN apt-get install -y man
RUN rm -r /var/lib/apt/lists/* 
RUN man ls
CMD ["bin", "bash"]
