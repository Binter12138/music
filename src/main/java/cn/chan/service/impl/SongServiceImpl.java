package cn.chan.service.impl;


import cn.chan.dao.SongDao;
import cn.chan.entity.Song;
import cn.chan.service.SongService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public class SongServiceImpl implements SongService{


    private SongDao songDao;

    public void setSongDao(SongDao songDao) {
        this.songDao = songDao;
    }

    /**
     * 添加歌曲
     * @param song
     */
    @Override
    public void addSong(Song song) {

        songDao.addSong(song);

    }

    /**
     * 歌曲、歌手查询
     * @param singername
     * @return
     */
    @Override
    public List<Song> findSong(String singername) {
        List<Song> songList = songDao.findSong(singername);
        return songList;
    }


    /**
     * 条件查询、模糊查询
     * @param sname
     * @return
     */
    @Override
    public List<Song> fuzzyQuery(String sname) {

        List<Song> songList = songDao.fuzzyQuery(sname);
        return songList;
    }

    /**
     * 查询所有歌曲
     * @return
     */
    @Override
    public List<Song> findAll() {

        List<Song> songList = songDao.findAll();

        return songList;
    }

    /**
     * 删除歌曲
     * @param songid
     * @return
     */
    @Override
    public Boolean delete(Integer songid) {


        songDao.delete(songid);
        return null;
    }

    /**
     * 按歌曲id查询
     * @param songid
     * @return
     */
    @Override
    public Song findById(Integer songid) {


        return songDao.findById(songid);
    }


    /**
     * 修改歌曲
     * @param song
     */
    @Override
    public void modifySong(Song song) {

        songDao.modifySong(song);

    }
}
