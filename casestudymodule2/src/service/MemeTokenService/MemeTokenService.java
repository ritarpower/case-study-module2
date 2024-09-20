package service.MemeTokenService;

import model.MemeToken;
import repository.MemeToken.IMemeTokenRepository;
import repository.MemeToken.MemeTokenRepository;

import java.util.List;

public class MemeTokenService implements IMemeTokenService {
    private IMemeTokenRepository memeTokenRepository = new MemeTokenRepository();
    @Override
    public List<MemeToken> getAll() {
        return memeTokenRepository.getAll();
    }

    @Override
    public void add(MemeToken memeToken) {
        memeTokenRepository.add(memeToken);
    }

    @Override
    public MemeToken findByNumber(int number) {
        return memeTokenRepository.findByNumber(number);
    }

    @Override
    public void update(MemeToken memeToken) {
        memeTokenRepository.update(memeToken);
    }

    @Override
    public void delete(MemeToken memeToken) {
        memeTokenRepository.delete(memeToken);
    }
}
